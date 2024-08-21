# IngenieriaDeSoftware2
Taller 1
Cuando hablamos de SRP nos referimos a que una clase debe tener únicamente una responsabilidad y en este caso la clase Usuario tiene mas de una responsabilidad porque vemos que:
Gestión de información del usuario: Este es el responsable de almacenar y acceder a la información de  usuario como lo sería el nombre y el correo electrónico
Envío de correo electrónico: Gestiona la información del usuario y es la encargada de manejar la lógica para el envío de correos electrónicos
Validación de contraseña: Esto pertenece al ámbito de autenticación y seguridad 
Cálculo del salario: Una parte es lógica de negocio y genera cambios frecuentes 
Por ende cada una de estas responsabilidades pueden cambiar de por razones totalmente diferentes, cuando usamos el SRP nos permite mejor manejo y mantenimiento del mismo
