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

- Datos BáSicos De Para Alumnos, Profesores Y Empleados Son: Nombre, Apellido, Dni Y DireccióN, Los Datos De Este Ultimo Son: Calle, Numero, Piso, Departamento, CóDigo Postal, Localidad. Tanto Los Empleados Y Profesores Debe Tener Un Sueldo.

- El Aula Debe Tener: Numero, TamañO (Mts X Mts), Cantidad De Pupitres, Tipo De PizarróN (Tiza O Pizarra).

- El PabellóN Deben Tener: TamañO (Mts²), Nombre Y DireccióN Con Los Mismos Datos Que Persona.

- La Carrera Debe Tener: Nombre, Cantidad De Materias Y Cantidad De AñOs Estimados.

------------

**Datos extras:**

- Cada Entidad Contara Con Un Id Propio Como TambiéN, Fecha De Alta Y ModificacióN.

- Al Dar De Alta Un Alumno, Se Le Puede Asignar Una Carrera Y Para El Caso De Los Profesores Se Le Puede Asignar Una O Mas Carreras.

- Al Dar De Alta Un Aula, Se Le Puede Asignar Un PabellóN Y Este Ultimo Puede Contener Varias Aulas.

- Al Dar De Alta Un Empleado, Se Le Puede Asignar Un PabellóN.

****