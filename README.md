# EjerciciosPOO2

Ejercicio 1. Implementa una clase Persona que cumpla las siguientes características:
• Sus atributos son: nombre, fecha de nacimiento, DNI (con letra), sexo (hombre, mujer,
NS/NC), peso y altura. No queremos que se acceda directamente a ellos pero sí a través de
métodos públicos. Piensa qué modificador de acceso es el más adecuado y el tipo del
atributo.
• Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo (0
números, cadena vacía para String, etc.). El sexo, por defecto, es NS/NC.
• Necesitamos los siguientes constructores:
➢ Uno con todos los atributos como parámetro.
➢ Uno con el nombre, fecha de nacimiento y sexo, el resto por defecto. 
➢ Uno que reciba el nombre, la fecha de nacimiento y un número a partir del cual generar
un DNI. Por ejemplo, si recibe un 1000, el valor numérico será >= 00001000.
• Si el nombre está vacío, debe ponerse un nombre por defecto (el de una constante).
• Métodos set de cada atributo, excepto de DNI.
• Los métodos que se implementarán son: 
➢ calcularIMC: calculará el Índice de Masa Corporal.
➢ getEdad: devolverá la edad en función de la fecha de nacimiento.
➢ esMayorDeEdad: indica si es mayor de edad.
➢ cartaDePresentacion: devuelve toda la información del objeto. 
➢ generaDNI()
 Genera un número aleatorio de 8 cifras junto con su letra correspondiente. Este
método será invocado cuando se construya el objeto. Puedes hacer uso de clases
externas para que te sea más fácil. No será visible al exterior.
 Tendrá una sobrescritura en la que si recibe un número entero, calculará el DNI a
partir de dicho número. Por ejemplo, si recibe un 1000, el DNI generado deberá ser a
partir del 1000.

Ejercicio 2. Implementa un programa que guarde en un diccionario personas (haciendo uso de la
clase Persona que acabas de implementar). La clave del diccionario debe ser el DNI. El programa
debe tener un menú que indique las siguientes opciones de menú:
• Mostrar la información de las personas almacenadas.
• Crear una nueva persona pidiendo por teclado, al usuario, nombre, fecha de nacimiento,
DNI, sexo, peso y altura.
• Crear una nueva persona pidiendo por teclado, al usuario, nombre, fecha de nacimiento y
sexo.
• Modificar la altura de una persona sabiendo su DNI.
• Mostrar, por cada persona, si es mayor o menor de edad.
• Salir.

Ejercicio 3. Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y saldo
(puede tener decimales). El titular será obligatorio y el saldo es opcional. El titular será un objeto
de la clase Persona del ejercicio anterior. Crea dos constructores, que cumplan con lo anterior, así
como los getters y setters. Además, deben existir las siguientes funcionalidades:
• toString(): devolverá una cadena de texto con la información de la clase (valor de sus
atributos).
• ingresar(): recibirá por parámetro la cantidad a ingresar en la cuenta. Si la cantidad
introducida es negativa, no se hará nada. Debe devolver si la operación se ha podido llevar
a cabo o no.
• retirar(): recibirá una cantidad a retirar de la cuenta (reduciéndose, por tanto, el saldo). Si la
cantidad a retirar supera el saldo, no se hará nada. Debe devolver si la operación se ha
podido llevar a cabo o no.
• retirar(): recibirá una cantidad a retirar de la cuenta y una comisión por retirada de dinero.
Por ejemplo, si la cantidad a retirar son 100 € y la comisión es del 2%, el saldo se deberá ver
reducido en 102 €. Debe devolver si la operación se ha podido llevar a cabo o no.

Ejercicio 4. Implementa una clase que permita representar una Transferencia bancaria.
• Para realizar una transferencia se necesita una cuenta de origen, una cuenta de destino y
una cantidad. Todos esos datos deben indicarse a través de un constructor con parámetros.
• Además, una transferencia debe constar de la fecha en la que se produce.
• Debemos contar con un método público realizarTransferencia que devuelva un texto
similar a “Miguel García Pérez ha hecho una transferencia de 1000 euros a Lara Pérez
López el día 2022/03/01” en caso de poder hacerse o un mensaje de “Imposible realizar la
transferencia” en caso de no poder llevarla a cabo.

Ejercicio 5. Implementa un programa que:
• Instancie una persona llamada María López Gutiérrez. Invéntate la fecha de nacimiento.
• Instancie una persona llamada Laura Jiménez Hernández. Invéntate la fecha de nacimiento.
• Instancie una cuenta para María con saldo de 500 €.
• Instancie una cuenta para Laura con saldo 1000 €.
• Realice una transferencia de María a Laura de 700 €. Muestra por pantalla la información
sobre la transferencia.
• Realice una transferencia de María a Laura de 75,5 €. Muestra por pantalla la información
sobre la transferencia.
• Muestre por pantalla el saldo de María y de Laura tras realizar las transferencias.

Ejercicio 6. Implementa una clase llamada FechaHora que permita representar una fecha y hora
determinadas. Debe tener las siguientes características:
• Un atributo para almacenar la fecha y hora representada.
• Un atributo para almacenar el formato en el que representar la fecha.
• Un atributo para almacenar el formato en el que representar la hora.
• Un constructor que reciba por parámetro los valores necesarios para setear los anteriores
atributos
 Métodos públicos (únicamente los siguientes):
◦ getFechaHora(): devuelve la fecha y hora almacenada en formato temporal (de fecha y
hora).
◦ getFecha(): devuelve la fecha almacenada en formato temporal.
◦ getFechaFormateada(): devuelve una cadena de texto con la fecha en el formato
especificado en el constructor.
◦ getHora(): devuelve la hora almacenada en formato temporal.
◦ getHoraFormateada(): devuelve una cadena de texto con la hora en el formato
especificado en el constructor.
◦ getNombreDia(): devolverá el nombre del día de la semana, en español, que es dicha
fecha (de lunes a domingo).
◦ getDiasHastaFinalDeAnyo(): devuelve cuántos días quedan hasta final de año.
◦ getMinutosHastaFinalDelDia(): devuelve cuántos minutos quedan hasta el final del día.
◦ getFechasSemanaActual(): devuelve un array con las 7 fechas del día de hoy
empezando por el lunes (índice 0) y terminado por el domingo (índice 6). Por ejemplo,
si la fecha es 15/11/2022, el índice 0 será el 14/11/2022 y el 6 será el 20/11/2022.
◦ getUTC(): devuelve la fecha y hora en UTC. Para ello, puedes hacer uso de la zona
horaria por defecto del sistema (la que esté configurada en el equipo en el que se ejecuta
el programa).

Ejercicio 7. Implementa un programa que le permita al usuario indicar una fecha con hora y le
muestre la siguiente información.

Ejercicio 8. Vamos a comenzar un conjunto de ejercicios para informar a un usuario sobre el precio
de alquiler de un Piso. Para ello, vamos a comenzar implementando la clase Piso. Por cada piso
necesitamos la siguiente información:
• Número de portal.
• Número de planta.
• Letra de la vivienda: puede ser A, B, C o D.
• Metros cuadrados del piso.
• Mobiliario que tiene el piso. Puede ser: “Sin amueblar”, “Básico”, “Normal” o “Premium”.
• Si el inquilino tiene derecho a hacer uso de la piscina o no.
Precisamos los siguientes métodos y/o funcionalidades:
• Un piso se puede crear introduciendo valores para todos sus atributos o indicando
únicamente número de portal, de planta, letra de la vivienda y metros cuadrados. En este
último caso, por defecto el piso estará sin amueblar y sin derecho a piscina.
• Podemos consultar y modificar los siguientes atributos: mobiliario y piscina. Si un inquilino
tiene derecho a piscina ya no podrá renunciar a dicho derecho, es decir, una vez que tienes
acceso a la piscina ya no puedes retirarlo.
• Una vez establecido valor para los siguientes atributos ya no se podrá modificar: portal,
planta, letra de la vivienda y metros cuadrados.
• Debe existir un método llamado descripción que devuelva una cadena de texto con la
información del piso similar a la siguiente teniendo en cuenta los siguientes requisitos
obligatorios:
◦ Si el inquilino tiene acceso a la piscina deberá aparecer “con derecho a piscina” en el
mensaje. En caso contrario, se debe indicar “sin derecho a piscina”
◦ Si el piso está sin amueblar debe indicarse “sin amueblar”. En caso contrario debe
aparecer “con mobiliario tipo” donde tipo es básico, normal o premium.

Ejercicio 9. Implementa una clase llamada Inmobiliaria_A (sin constructores) que tenga un
método público llamado getPrecio (al que se le pasa un Piso) que nos devuelva el precio de alquilar
dicho piso en función de la siguiente lógica de negocio:
a) Portal. Si el piso está en un portal número par el alquiler se incrementará en 100 € y si el
piso está en un portal impar el alquiler se incrementará en 150 €.
b) Planta. Por cada planta se cobrará 11 €. Por ejemplo, si el piso está en la 4a
 planta, se
cobrarán 44 € adicionales.
c) Letra. Por las letras A y B se cobrarán 35 €. Por la letra C se cobrará 60 €. En cualquier otro
caso, se incrementará el precio del alquiler en 100 €.
d) Metros cuadrados. Se cobrarán 6’5 € por metro cuadrado.
e) Mobiliario. En función del tipo de mobiliario el alquiler se verá incrementado así:
• Básico: 100 €.
• Normal: 150 €.
• Premium: 300 €.
f) Si el alquiler da derecho a piscina, se incrementará el alquiler en 250 €.

Ejercicio 10. Implementa una clase llamada Inmobiliaria_B (sin constructores) que tenga un
método público llamado getPrecio (al que se le pasa un Piso) que nos devuelva el precio de alquilar
dicho piso en función de la siguiente lógica de negocio:
a) Se parte de un precio base compuesto por la suma del precio por metro cuadrado y del
precio por acceso a la piscina. Posteriormente, se irán aplicando porcentajes de subida sobre
el precio acumulado: primero se calcula el percio base y se le aplica el porcentaje del
mobiliario. Al resultado anterior se le aplica el porcentaje del portal y así sucesivamente.
b) Metros cuadrados. Se cobrarán 5,5 € por metro cuadrado.
c) Piscina. Si el piso tiene derecho a piscina, se cobrarán 100 €.
d) Mobiliario. En función del tipo de mobiliario el porcentaje de alquiler se verá incrementado:
• Básico: 5%.
• Normal: 5%.
• Premium: 10%.
e) Portal. Por cada número de portal se verá incrementado un 1% el alquiler. Por ejemplo, los
pisos del portal 3 tendrán un incremento del 3%.
f) Planta. El porcentaje de incremento seguirá las siguientes reglas (únicamente debe aplicar
una de ellas, es decir, la primera que se cumpla según el siguiente orden):
• Hasta la segunda planta: 11%.
• Si la planta es inferior o igual a la cuarta y el mobiliario es básico o es normal (uno de los
dos): 13%.
• Si la planta es igual o inferior a la sexta o el mobiliario NO es básico: 14%.
• Se aplicará un 15% en cualquier otro caso.
g) Letra. Si la letra es la A se aplicará un 1% de incremento sobre el alquiler y un 3% en
cualquier otro caso.

Ejercicio 11. Implementa una clase llamada Portal que contenga, como atributos, el número de
portal que es y un conjunto de pisos. Además, se debe permitir agregar un nuevo piso al portal,
obtener los pisos de dicho portal, sacar un listado con la descripción de todos los pisos en alquiler
de dicho portal y saber el número de pisos que hay en dicho portal.

Ejercicio 12. Implementa una clase llamada CatalogoPisos que tenga un diccionario con la
información de pisos. La clave debe ser el número de portal y el valor una clase Portal. Dicha clase
debe tener las siguientes funcionalidades:
• Obtener la información de todos los portales (la colección de portales).
• Obtener un Portal dado su número de portal.
• Añadir un nuevo portal (pasando por parámetro el número de portal y el propio Portal).
• Añadir un nuevo Piso a un portal (pasando el número de portal y el Piso).

Ejercicio 13. Implementa un programa que genere 4 pisos con diferentes valores y realice las
siguientes funcionalidades (implementa cada una con un método tratando de reutilizar lo máximo
posible):
a) Mostrar la información de todos los pisos.
b) Mostrar el precio de cada piso según la Inmobiliaria_A.
c) Mostrar el precio de cada piso según la Inmobiliara_B.
d) Mostrar la diferencia de precio de cada piso según Inmobiliaria_A e Inmobiliaria_B
