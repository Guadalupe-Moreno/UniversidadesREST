![](IBM.png)

### Caso Practico
- Negocio del caso basado en una universidad.
- Necesidad básica CRUD de todas las entidades.
- Adicional se solicita métodos de consultas particulares.
- La aplicación deberá ser expuesta como servicio Rest.
- La aplicación debe de estar documentada.

**Las entidades que manejara el sistemas son:**

+ Aula
+ Pabellón
+ Carrera
+ Persona:
    * Alumno
    * Profesor
    * Empleado:
		- Administrativo
		- Mantenimiento

------------

**Datos por entidad:**

- Datos básicos de para alumnos, profesores y empleados son: Nombre, Apellido, Dni y Dirección, los datos de este ultimo son: Calle, Numero, Piso, Departamento, Código Postal, Localidad. Tanto los empleados y profesores debe tener un sueldo.

- El aula debe tener: Numero, Tamaño (mts x mts), Cantidad de pupitres, Tipo de pizarrón (Tiza o Pizarra).

- El pabellón deben tener: Tamaño (mts²), Nombre y Dirección con los mismos datos que persona.

- La carrera debe tener: Nombre, Cantidad de Materias y Cantidad de Años estimados.


------------

**Datos extras:**

- Cada entidad contara con un ID propio como también, Fecha de alta y modificación.

- Al dar de alta un Alumno, se le puede asignar una Carrera y para el caso de los Profesores se le puede asignar una o mas Carreras.

- Al dar de alta un Aula, se le puede asignar un Pabellón y este ultimo puede contener varias Aulas.

- Al dar de alta un Empleado, se le puede asignar un Pabellón.

------------

**Modelo Relacional:**

![](MER.png)

------------

****