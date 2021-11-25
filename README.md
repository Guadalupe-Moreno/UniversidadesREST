### Caso Practico
- Negocio del caso basado en una universidad.
- Necesidad b�sica CRUD de todas las entidades.
- Adicional se solicita m�todos de consultas particulares.
- La aplicaci�n deber� ser expuesta como servicio Rest.
- La aplicaci�n debe de estar documentada.

**Las entidades que manejara el sistemas son:**

+ Aula
+ Pabell�n
+ Carrera
+ Persona:
    * Alumno
    * Profesor
    * Empleado:
		- Administrativo
		- Mantenimiento

------------

**Datos por entidad:**

- Datos B�Sicos De Para Alumnos, Profesores Y Empleados Son: Nombre, Apellido, Dni Y Direcci�N, Los Datos De Este Ultimo Son: Calle, Numero, Piso, Departamento, C�Digo Postal, Localidad. Tanto Los Empleados Y Profesores Debe Tener Un Sueldo.

- El Aula Debe Tener: Numero, Tama�O (Mts X Mts), Cantidad De Pupitres, Tipo De Pizarr�N (Tiza O Pizarra).

- El Pabell�N Deben Tener: Tama�O (Mts�), Nombre Y Direcci�N Con Los Mismos Datos Que Persona.

- La Carrera Debe Tener: Nombre, Cantidad De Materias Y Cantidad De A�Os Estimados.

------------

**Datos extras:**

- Cada Entidad Contara Con Un Id Propio Como Tambi�N, Fecha De Alta Y Modificaci�N.

- Al Dar De Alta Un Alumno, Se Le Puede Asignar Una Carrera Y Para El Caso De Los Profesores Se Le Puede Asignar Una O Mas Carreras.

- Al Dar De Alta Un Aula, Se Le Puede Asignar Un Pabell�N Y Este Ultimo Puede Contener Varias Aulas.

- Al Dar De Alta Un Empleado, Se Le Puede Asignar Un Pabell�N.

****