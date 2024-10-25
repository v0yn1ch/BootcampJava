# React Router Dom v6

1. Instalar los modulos de React-Router-Dom en el proyecto de React

```bash
npm install React-Router-Dom
```

2. En el archivo `main.jsx` debemos crear una constante `router` donde vive el componente `createBrowserRouter` y dentro las rutas especificas que el usuario puede seguir (en forma de un array de objetos).

3. Importar createBrowserRouter desde "react-router-dom".

4. Crear la primera ruta dentro de la constante `router`, es decir, llenar el primer objeto que recibe un par key-value referentes a la ruta (path) y el componente al que apunta (element)

```javascript
const router = createBrowserRouter([
  {
    path: "/",
    element: <App />,
  },
]);
```

5. Para indicar donde se renderiza react-router, debemos sustituir el componente `<App />` que se encuentra dentro de `React,<StrictMode>` y en su lugar, agregar el componente `<RouterProvider />` el cual va a recibir el conjunto (array) de rutas a renderizar
