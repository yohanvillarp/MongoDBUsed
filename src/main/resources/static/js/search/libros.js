function buscarLibros() {
        const query = document.getElementById('searchInput').value;

        fetch(`/libros/search?query=${query}`)
            .then(response => response.json())
            .then(data => {
                const librosDiv = document.querySelector('.Libros');
                librosDiv.innerHTML = ''; // Limpiar los resultados anteriores

                data.forEach(libro => {
                    const contenidoDiv = document.createElement('div');
                    contenidoDiv.className = 'contenido';

                    const titulo = document.createElement('h2');
                    titulo.textContent = libro.nombre;

                    const imagenDiv = document.createElement('div');
                    imagenDiv.className = 'imagen';
                    const imagen = document.createElement('img');
                    imagen.src = libro.rutaPortada;
                    imagen.alt = libro.nombre;
                    imagenDiv.appendChild(imagen);

                    const botonDiv = document.createElement('div');
                    botonDiv.className = 'boton';
                    const boton = document.createElement('button');
                    boton.textContent = 'Ver Libro';
                    botonDiv.appendChild(boton);

                    contenidoDiv.appendChild(titulo);
                    contenidoDiv.appendChild(imagenDiv);
                    contenidoDiv.appendChild(botonDiv);

                    librosDiv.appendChild(contenidoDiv);
                });
            })
            .catch(error => console.error('Error al buscar libros:', error));
    }