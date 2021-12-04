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

# UniversidadesREST
Paso a paso para ejecutar la aplicaci�n:

1. Instalar PostgreSQL
- Al momento de instalar tener en cuenta la siguiente configuraci�n del motor de base de datos:
- usuario: postgres
- contrasena: admin

(Si ya tiene instalado Postgres omitir este paso y valide el usuario y la contrase�a de la base de datos)

2. Luego de instalar el motor de base de datos debe:

- Crear base de datos universidad.

Una vez creada la base de datos ejecutar los siguientes queries:

- create schema universidad;

3. Clonar y descargar el presente proyecto:
- https://github.com/Guadalupe-Moreno/UniversidadesREST.git 

4. Importar el proyecto como MAVEN en la IDE spring tool suite, eclipse o intellij
**se debe tener instalada la librer�a lombook**

![](Import.png)

5. Ejecutar el proyecto **run as spring boot app**

------------

**Modelo Relacional:**

![](MER.png)

****