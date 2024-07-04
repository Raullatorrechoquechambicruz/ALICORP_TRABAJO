    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Random;
    import java.util.Scanner;
    import java.time.LocalDateTime;
    import java.io.File;
    import java.io.FileWriter;
    import java.io.IOException;

    public class koky {
        Scanner invoker = new Scanner(System.in);
        String[] Alimentos = {"Tallarín", "Oreo", "Atún", "Cereales", "Panetón", "Gelatina"};
        Random random = new Random();
        double[] precio = {5.50, 2.50, 2.50, 5.00, 25.00, 2.00};
        int[] carrito = new int[Alimentos.length];
        int opcion, cantidad;
        String nombreCliente;
        double montoInicialTarjeta = 1000;
        ArrayList<Usuario> usuarios = new ArrayList<>();

        public static void main(String[] args) {
            System.out.println("----------LE DAMOS LA BIENVENIDA A ALICORP----------");
            koky invoker = new koky();
            invoker.MenuPrincipal();
        }

        public void MenuPrincipal() {
            System.out.println("---------BIENVENIDO A ALICORP-----------");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Salir");
            opcion = invoker.nextInt();
            invoker.nextLine();
            switch (opcion) {
                case 1:
                    this.RegistrarUsuario();
                    break;
                case 2:
                    this.IniciarSesion();
                    break;
                case 3:
                    System.out.println("Gracias por visitar Alicorp. ¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
                    this.MenuPrincipal();
                    break;
            }
        }

        public void RegistrarUsuario() {
            System.out.println("Ingrese su nombre:");
            String nombre = invoker.nextLine();
            System.out.println("Ingrese su contraseña:");
            String contrasena = invoker.nextLine();
            usuarios.add(new Usuario(nombre, contrasena));
            System.out.println("Usuario registrado exitosamente.");
            this.MenuPrincipal();
        }

        public void IniciarSesion() {
            System.out.println("Ingrese su nombre:");
            String nombre = invoker.nextLine();
            System.out.println("Ingrese su contraseña:");
            String contrasena = invoker.nextLine();

            for (Usuario usuario : usuarios) {
                if (usuario.getNombre().equals(nombre) && usuario.getContrasena().equals(contrasena)) {
                    nombreCliente = nombre;
                    System.out.println("Inicio de sesión exitoso.");
                    this.MenuCliente();
                    return;
                }
            }
            System.out.println("Nombre o contraseña incorrectos.");
            this.MenuPrincipal();
        }

        public void MenuCliente() {
            System.out.println("---------BIENVENIDO A ALICORP-----------");
            System.out.println("Marque alguna de las siguientes opciones");
            System.out.println(" 1.- Comprar productos");
            System.out.println(" 2.- Salir");
            opcion = invoker.nextInt();
            invoker.nextLine();
            switch (opcion) {
                case 1:
                    this.ComprarAlimentos();
                    break;
                case 2:
                    System.out.println("Gracias por visitar Alicorp. ¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
                    this.MenuCliente();
                    break;
            }
        }

        public void ComprarAlimentos() {
            System.out.println("--------------------------------------------------");
            System.out.println("---- Seleccione entre las siguientes opciones ----");
            System.out.println("--------------------------------------------------");
            System.out.println("--------- Opciones ------------------ Precios ----");
            System.out.println("--------------------------------------------------");
            System.out.println("-----   1    |    Tallarín 🍜    |   $5.50   -----");
            System.out.println("-----   2    |    Oreo 🍪        |   $2.50   -----");
            System.out.println("-----   3    |    Atún 🥫        |   $2.50   -----");
            System.out.println("-----   4    |    Cereales 🥣    |   $5.00   -----");
            System.out.println("-----   5    |    Paneton 🎁     |   $25.00  -----");
            System.out.println("-----   6    |    Gelatina 🍮    |   $2.00   -----");
            System.out.println("--------------------------------------------------");
            for (int i = 0; i < Alimentos.length; i++) {
            }
            opcion = invoker.nextInt();
            invoker.nextLine();
            if (opcion < 1 || opcion > Alimentos.length) {
                System.out.println("Opción no válida");
                this.ComprarAlimentos();
                return;
            }

            System.out.println("Ingrese la cantidad que llevará:");
            cantidad = invoker.nextInt();
            carrito[opcion - 1] += cantidad;
            System.out.println("Usted llevará " + carrito[opcion - 1] + " unidad(es) de " + Alimentos[opcion - 1]);

            // Mostrar opciones adicionales
            this.mostrarOpciones();
        }

        public void mostrarOpciones() {
            System.out.println("¿Desea elegir otra opción?");
            System.out.println("1. Sí");
            System.out.println("2. No");
            System.out.println("3. Tipo de Pago");
            opcion = invoker.nextInt();
            invoker.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Volviendo a la opción de compra");
                    this.ComprarAlimentos();
                    break;
                case 2:
                    // Mostrar tipo de pago y generar boleta
                    this.mostrarTipoPagoYGenerarBoleta();
                    break;
                case 3:
                    // Mostrar tipo de pago
                    this.mostrarTipoPago();
                    break;
                default:
                    System.out.println("Opción no válida");
                    this.mostrarOpciones();
                    break;
            }
        }

        public void mostrarTipoPagoYGenerarBoleta() {
            this.mostrarTipoPago();
            this.generarBoleta();
        }

        public void mostrarTipoPago() {
            System.out.println("Seleccione el tipo de pago:");
            System.out.println("1. Efectivo");
            System.out.println("2. Tarjeta de crédito");
            System.out.println("3. Tarjeta de débito");
            System.out.println("4. Transferencia bancaria");
            int tipoPago = invoker.nextInt();
            invoker.nextLine();

            switch (tipoPago) {
                case 1:
                    System.out.println("Tipo de pago seleccionado: Efectivo");
                    realizarPagoEfectivo();
                    break;
                case 2:
                    System.out.println("Tipo de pago seleccionado: Tarjeta de crédito");
                    realizarPagoTarjetaCredito();
                    break;
                case 3:
                    System.out.println("Tipo de pago seleccionado: Tarjeta de débito");
                    realizarPagoTarjetaDebito();
                    break;
                case 4:
                    System.out.println("Tipo de pago seleccionado: Transferencia bancaria");
                    realizarPagoTransferenciaBancaria();
                    break;
                default:
                    System.out.println("Opción no válida");
                    this.mostrarTipoPago();
                    break;
            }
        }

        public void realizarPagoEfectivo() {
            double totalPagar = calcularTotalPagar();
            System.out.printf("Total a pagar: S/ %.2f%n", totalPagar);
            int intentos = 3;
            while (intentos > 0) {
                System.out.println("Ingrese el monto recibido en efectivo:");
                double montoRecibido = invoker.nextDouble();
                invoker.nextLine();
                if (montoRecibido >= totalPagar) {
                    double cambio = montoRecibido - totalPagar;
                    System.out.printf("Pago recibido: S/ %.2f%n", montoRecibido);
                    System.out.printf("Cambio: S/ %.2f%n", cambio);
                    System.out.println("¡Gracias por su compra!");
                    return;
                } else {
                    System.out.println("El monto recibido es insuficiente. Intente nuevamente.");
                    intentos--;
                }
            }
            System.out.println("Se acabaron los intentos. Seleccione otro método de pago.");
            this.mostrarTipoPago();
        }

        public void realizarPagoTarjetaCredito() {
            System.out.println("Ingrese el número de tarjeta de crédito:");
            String numeroTarjeta = invoker.nextLine();
            System.out.println("Realizando pago con tarjeta de crédito número: " + numeroTarjeta);
            double totalPagar = calcularTotalPagar();
            System.out.printf("Total a pagar: S/ %.2f%n", totalPagar);

            if (totalPagar <= montoInicialTarjeta) {
                montoInicialTarjeta -= totalPagar;
                System.out.println("Pago exitoso con tarjeta de crédito.");
                System.out.printf("Nuevo saldo de tarjeta: S/ %.2f%n", montoInicialTarjeta);
                System.out.println("¡Gracias por su compra!");
            } else {
                System.out.println("Saldo insuficiente en la tarjeta de crédito. Intente con otro método de pago.");
                this.mostrarTipoPago();
            }
        }

        public void realizarPagoTarjetaDebito() {
            System.out.println("Ingrese el número de tarjeta de débito:");
            String numeroTarjeta = invoker.nextLine();
            System.out.println("Realizando pago con tarjeta de débito número: " + numeroTarjeta);
            double totalPagar = calcularTotalPagar();
            System.out.printf("Total a pagar: S/ %.2f%n", totalPagar);

            if (totalPagar <= montoInicialTarjeta) {
                montoInicialTarjeta -= totalPagar;
                System.out.println("Pago exitoso con tarjeta de débito.");
                System.out.printf("Nuevo saldo de tarjeta: S/ %.2f%n", montoInicialTarjeta);
                System.out.println("¡Gracias por su compra!");
            } else {
                System.out.println("Saldo insuficiente en la tarjeta de débito. Intente con otro método de pago.");
                this.mostrarTipoPago();
            }
        }

        public void realizarPagoTransferenciaBancaria() {
            System.out.println("Ingrese el número de cuenta bancaria:");
            String numeroCuenta = invoker.nextLine();
            System.out.println("Realizando transferencia bancaria a la cuenta número: " + numeroCuenta);
            double totalPagar = calcularTotalPagar();
            System.out.printf("Total a pagar: S/ %.2f%n", totalPagar);

            if (totalPagar <= montoInicialTarjeta) {
                montoInicialTarjeta -= totalPagar;
                System.out.println("Transferencia bancaria exitosa.");
                System.out.printf("Nuevo saldo de tarjeta: S/ %.2f%n", montoInicialTarjeta);
                System.out.println("¡Gracias por su compra!");
            } else {
                System.out.println("Saldo insuficiente en la tarjeta. Intente con otro método de pago.");
                this.mostrarTipoPago();
            }
        }

        public double calcularTotalPagar() {
            double subtotal = 0;
            for (int i = 0; i < Alimentos.length; i++) {
                subtotal += carrito[i] * precio[i];
            }
            return subtotal;
        }

        public void generarBoleta() {
            double subtotal = 0;
            LocalDateTime fechaHoraActual = LocalDateTime.now();
            System.out.println("------------------- BOLETA DE COMPRA -------------------");
            System.out.println("Cliente: " + nombreCliente);
            System.out.println("Fecha y hora: " + fechaHoraActual);
            System.out.println("Productos comprados:");

            for (int i = 0; i < Alimentos.length; i++) {
                if (carrito[i] > 0) {
                    double totalProducto = carrito[i] * precio[i];
                    System.out.printf("%s: %d unidad(es) - Subtotal: S/ %.2f%n", Alimentos[i], carrito[i], totalProducto);
                    subtotal += totalProducto;
                }
            }

            double igv = subtotal * 0.18;
            double totalPagar = subtotal + igv;

            System.out.println("--------------------------------------------");
            System.out.printf("Subtotal: S/ %.2f%n", subtotal);
            System.out.printf("IGV (18%%): S/ %.2f%n", igv);
            System.out.printf("Total a pagar: S/ %.2f%n", totalPagar);
            System.out.println("--------------------------------------------");

            System.out.println("¿Desea guardar la boleta en un archivo? (S/N)");
            String respuesta = invoker.nextLine();
            if (respuesta.equalsIgnoreCase("S")) {
                guardarBoletaEnArchivo(fechaHoraActual, subtotal, igv, totalPagar);
            }
        }

        public void guardarBoletaEnArchivo(LocalDateTime fechaHora, double subtotal, double igv, double totalPagar) {
            try {
                File archivo = new File("boleta.Alicorp");
                FileWriter escritor = new FileWriter(archivo);
                escritor.write("------------------- BOLETA DE COMPRA -------------------\n\n");
                escritor.write("Cliente: " + nombreCliente + "\n\n");
                escritor.write("Fecha y hora: " + fechaHora + "\n\n");
                escritor.write("Productos comprados:\n\n");

                for (int i = 0; i < Alimentos.length; i++) {
                    if (carrito[i] > 0) {
                        double totalProducto = carrito[i] * precio[i];
                        escritor.write(Alimentos[i] + ": " + carrito[i] + " unidad(es) - Subtotal: S/ " + String.format("%.2f", totalProducto) + "\n");
                    }
                }

                System.out.println("Boleta guardada exitosamente en el archivo 'boleta.txt'.");
            } catch (IOException e) {
                System.out.println("Error al guardar la boleta en el archivo.");
            }
        }

        class Usuario {
            private String nombre;
            private String contrasena;

            public Usuario(String nombre, String contrasena) {
                this.nombre = nombre;
                this.contrasena = contrasena;
            }

            public String getNombre() {
                return nombre;
            }

            public String getContrasena() {
                return contrasena;
            }
        }
    }
