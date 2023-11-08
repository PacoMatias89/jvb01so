# Ejercicio Nº 1 - Reserva de Vuelos - Individual
Aplicación en el cual vamos a controlar que los datos agregados desde teclado sea válidos.
En este ejercicio se nos pide que que validemos como he comentado anteriormente todos los campos, y que cuando 
el campo no sea válido nos muestre un mensaje amigable y entendible para el usuario. 

## Métodos de validaciones

<pre>
 static void validarNombre(String nombre) throws ReservaInvalidaException {
        if (nombre == null || nombre.trim().isEmpty() || !nombre.matches("^[\\p{L}\\s]+$")) {
            throw new ReservaInvalidaException("El nombre del viajero es requerido y debe contener letras, incluyendo acentos y espacios.");
        }
    }

    static void validarDestino(String destino) throws ReservaInvalidaException {
        if (destino == null || destino.trim().isEmpty() || !destino.matches("^[\\p{L}\\s]+$")) {
            throw new ReservaInvalidaException("El destino es requerido y debe contener letras, incluyendo acentos y espacios.");
        }
    }


    static void validarFecha(String fechaStr) throws ReservaInvalidaException {
        try {
            LocalDate fecha = LocalDate.parse(fechaStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            if (fecha.isBefore(LocalDate.now())) {
                throw new ReservaInvalidaException("La fecha de viaje debe ser en el futuro.");
            }
        } catch (DateTimeParseException e) {
            throw new ReservaInvalidaException("El formato de la fecha no es válido.");

        }
    }



    static void validarNumeroAsientos(int numeroAsientos) throws ReservaInvalidaException {
        if (numeroAsientos <= 0) {
            throw new ReservaInvalidaException("El número de asientos debe ser mayor que cero.");
        }
    }

</pre>

Con estos métodos voy los voy llamando uno a uno en el menú creado en el main:

<pre>
System.out.println("------------Aerolínea Air Fiasco Reserva de Vuelos------------");
                System.out.println("El número de asientos disponibles en el vuelo es: " + numeroAsientosDisponibles);
                System.out.println("Introduce el nombre del viajero:");
                String nombre = sc.nextLine();
                Cliente.validarNombre(nombre);
                System.out.println("Introduce un destino para el viaje:");
                String destino = sc.nextLine();
                Cliente.validarDestino(destino);
                System.out.println("Introduce la fecha del viaje (dd/MM/yyyy):");

                try {
                    String fechaStr = sc.nextLine();
                    Cliente.validarFecha(fechaStr);
                    LocalDate fechaViaje = LocalDate.parse(fechaStr, formatter);
                    System.out.println("Introduce el número de asientos deseados:");
                    int numeroAsientos = Integer.parseInt(sc.nextLine());
                    Cliente.validarNumeroAsientos(numeroAsientos);

                    if (numeroAsientos <= numeroAsientosDisponibles) {
                        Cliente nuevoCliente = new Cliente(nombre, destino, fechaViaje, numeroAsientos);
                        clientes.add(nuevoCliente);
                        numeroAsientosDisponibles -= numeroAsientos; // Restar asientos reservados
                        System.out.println("Reserva realizada con éxito.");
                    } else {
                        System.out.println("No hay suficientes asientos disponibles. Por favor, intenta con un número menor de asientos o espere al siguiene vuelo. Gracias.");
                    }

                } catch (DateTimeParseException e) {
                    throw new ReservaInvalidaException("El formato de la fecha no es válido. Utiliza el formato dd/MM/yyyy.");
                }

</pre>

