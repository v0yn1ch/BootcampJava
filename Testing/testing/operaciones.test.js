const { add, substract, multiply, divide, residuo } = require("../operaciones");

describe("probandod la funcion add", () => {
  test("probando que la suma de 2+2 = 4", () => {
    expect(add(2, 2)).toBe(4);
  });

  test("probando que la suma de 3+2 = 5", () => {
    expect(add(3, 2)).toBe(5);
  });

  test("probando que en caso de que no sea number retorn undefined: con string", () => {
    expect(add("3", 2)).toBeUndefined();
  });

  test("probando que en caso de que no sea number retorna undefined: boolean", () => {
    expect(add(3, true)).toBeUndefined();
  });
});

describe("probando funcion substract", () => {
  test("probando que la resta de 2-2 = 0", () => {
    expect(substract(2, 2)).toBe(0);
  });

  test("probando que la resta de 3-2 = 1", () => {
    expect(substract(3, 2)).toBe(1);
  });

  test("probando que en caso de que no sea number retorn undefined: con string", () => {
    expect(substract("3", 2)).toBeUndefined();
  });

  test("probando que en caso de que no sea number retorna undefined: boolean", () => {
    expect(substract(3, true)).toBeUndefined();
  });
});

describe("probando funcion divide", () => {
  test("probando que la division de 0 retorne undefined", () => {
    expect(divide(2, 0)).toBeUndefined();
  });
  test("probando que si se ingresa 0 en a y 0 en b retorne = No puedes poner 0 en los dos argunmentos", () => {
    expect(divide(0, 0)).toBe("No puedes poner 0 en los dos argumentos");
  });
});

test("probando 2*128=256", () => {
  expect(multiply(2, 128)).toBe(256);
});

describe("Probando funcion de residuo", () => {
  test("probando que un numero par %2 sea == 0", () => {
    expect(residuo(4, 2)).toBe(0);
  });
  test("probanddo que un numero impar %2 sea !=0", () => {
    expect(residuo(33, 2)).toBeGreaterThan(0);
  });
  test("probando si un numero termina en 0, n%10 == 0", () => {
    expect(residuo(32480, 10)).toBe(0);
  });
  test("probando si con un argumento tipo string  nos da false", () => {
    expect(residuo("hola", 3)).toBeFalsy();
  });
  test("probando que si el divisor es 0 retorne undefined", () => {
    expect(residuo(2, 0)).toBeUndefined();
  });
});
