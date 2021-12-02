![](IBM.png)

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

- Datos b�sicos de para alumnos, profesores y empleados son: Nombre, Apellido, Dni y Direcci�n, los datos de este ultimo son: Calle, Numero, Piso, Departamento, C�digo Postal, Localidad. Tanto los empleados y profesores debe tener un sueldo.

- El aula debe tener: Numero, Tama�o (mts x mts), Cantidad de pupitres, Tipo de pizarr�n (Tiza o Pizarra).

- El pabell�n deben tener: Tama�o (mts�), Nombre y Direcci�n con los mismos datos que persona.

- La carrera debe tener: Nombre, Cantidad de Materias y Cantidad de A�os estimados.


------------

**Datos extras:**

- Cada entidad contara con un ID propio como tambi�n, Fecha de alta y modificaci�n.

- Al dar de alta un Alumno, se le puede asignar una Carrera y para el caso de los Profesores se le puede asignar una o mas Carreras.

- Al dar de alta un Aula, se le puede asignar un Pabell�n y este ultimo puede contener varias Aulas.

- Al dar de alta un Empleado, se le puede asignar un Pabell�n.

------------

**Modelo Relacional:**

![](MER.png)

------------

****