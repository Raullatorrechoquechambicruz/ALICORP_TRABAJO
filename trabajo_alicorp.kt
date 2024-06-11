import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class trabajo_alicorp {
    private int cant_productos, opcion;

    public String fEDAD() {
        Scanner invoker = new Scanner(System.in);
        System.out.println("Registrate aqui para ingresar a ALICORP");
        System.out.println("Ingrese el día de su nacimiento (DD): ");
        int dia = invoker.nextInt();
        System.out.println("Ingrese el mes de su nacimiento (MM): ");
        int mes = invoker.nextInt();
        System.out.println("Ingrese el año de su nacimiento (YYYY): ");
        int anio = invoker.nextInt();
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        LocalDate fechaActual = LocalDate.now();
        int edad = Period.between(fechaNacimiento, fechaActual).getYears();
        invoker.nextLine();
        if (edad >= 18) {
            System.out.println("proceda a llenar sus datos");
            this.fDatosClientes();
            this.fTipoProducto();
            this.fTipoPago();
        }
        if (edad <= 18) {
            System.out.println("Usted es menor de edad");
        }

        return null;
    }

    public String fDatosClientes() {
        String nombre, apellido, dni, sexo;
        Scanner cop = new Scanner(System.in);
        System.out.println("---DATOS DE LA PERSONA---");
        System.out.println("ingrese su nombre");
        nombre = cop.nextLine();
        System.out.println("Ingrese sus apellidos");
        apellido = cop.nextLine();
        System.out.println("Ingrese su numero de dni");
        dni = cop.nextLine();


        return null;
    }

    public String fTipoProducto() {
        Scanner pato = new Scanner(System.in);

        System.out.println("Tenemos estos productos");
        System.out.println(" 1 Fideos Don Vittorio y Lavaggi \n 2 Detergentes Bolívar y Opal \n 3 Aceites Primor y Cocinero \n 4 Jabón Bolívar y Marsella \n 5 Suavizante Bolívar \n 6 Galletas Casino y Tentación \n 7 Margarina Manty \n 8 Mayonesa Alacena \n 9 Crema de ají Tarí \n 10 Refrescos Negrita \n 11 Mazamorra Negrita \n 12 Harina Blanca Flor \n 13 Salsa Roja Don Vittorio \n 14 Panetones Sayón \n 15 Cereales Angel");
        opcion = pato.nextInt();
        switch (opcion) {
            case 1:
            if (cant_productos <= 1) {
                System.out.println("Puede ocupar " + cant_productos + "Fideos Don Vittorio y Lavaggi.");
            } else {
                int Fideos_Don_Vittorio_y_Lavaggi = (int) Math.ceil((double) cant_productos / 1);
                System.out.println("Puede ocupar " + Fideos_Don_Vittorio_y_Lavaggi + "Fideos Don Vittorio y Lavaggi.");
            }
            double  totalfideos=3.99,totalfideoslavaggi;
            int cantidadfiedosvittorio;
            System.out.println("¿cuantos productos desea llevar?");
            cantidadfiedosvittorio=pato.nextInt();
            totalfideoslavaggi=totalfideos * cantidadfiedosvittorio;
            System.out.println("el total a pagar es:" + totalfideos);
            break;

            case 2:
            if (cant_productos <= 1) {
                System.out.println("Puede ocupar " + cant_productos + "Detergentes Bolívar y Opal.");
            } else {
                int Detergentes_Bolívar_y_Opal = (int) Math.ceil((double) cant_productos / 1);
                System.out.println("Puede ocupar " + Detergentes_Bolívar_y_Opal + "Detergentes Bolívar y Opal.");
            }
            double  totaldetegetes=38.60,totaldetergentesopal;
            int cantidaddetergentebolivar;
            System.out.println("¿cuantos productos desea llevar?");
            cantidaddetergentebolivar=pato.nextInt();
            totaldetergentesopal=totaldetegetes * cantidaddetergentebolivar;
            System.out.println("el total a pagar es:" + totaldetegetes);
            break;

            case 3:
            if (cant_productos <= 1) {
                System.out.println("Puede ocupar " + cant_productos + "Aceites Primor y Cocinero.");
            } else {
                int Aceites_Primor_y_Cocinero = (int) Math.ceil((double) cant_productos / 1);
                System.out.println("Puede ocupar " + Aceites_Primor_y_Cocinero + "Aceites Primor y Cocinero.");
            }
            double  totalaceite=7.00,totalaceitecocinero;
            int cantidadaceiteprimor;
            System.out.println("¿cuantos productos desea llevar?");
            cantidadaceiteprimor=pato.nextInt();
            totalaceitecocinero=totalaceite * cantidadaceiteprimor;
            System.out.println("el total a pagar es:" + totalaceite);
            break;

            case 4:
            if (cant_productos <= 1) {
                System.out.println("Puede ocupar " + cant_productos + "Jabón Bolívar y Marsella.");
            } else {
                int Jabón_Bolívar_y_Marsella = (int) Math.ceil((double) cant_productos / 1);
                System.out.println("Puede ocupar " + Jabón_Bolívar_y_Marsella + "Jabón Bolívar y Marsella.");
            }
            double  totaljabon=5.50,totaljabonmarsella;
            int cantidadjabonbolivar;
            System.out.println("¿cuantos productos desea llevar?");
            cantidadjabonbolivar=pato.nextInt();
            totaljabonmarsella=totaljabon * cantidadjabonbolivar;
            System.out.println("el total a pagar es:" + totaljabon);
            break;

            case 5:
            if (cant_productos <= 1) {
                System.out.println("Puede ocupar " + cant_productos + "Suavizante Bolívar.");
            } else {
                int Suavizante_Bolívar = (int) Math.ceil((double) cant_productos / 1);
                System.out.println("Puede ocupar " + Suavizante_Bolívar + "Suavizante Bolívar.");
            }
            double  total=25.00,totalsuavizante;
            int cantidadsuavebolivar;
            System.out.println("¿cuantos productos desea llevar?");
            cantidadsuavebolivar=pato.nextInt();
            totalsuavizante=total * cantidadsuavebolivar;
            System.out.println("el total a pagar es:" + total);
            break;

            case 6:
            if (cant_productos <= 1) {
                System.out.println("Puede ocupar " + cant_productos + "Galletas Casino y Tentación.");
            } else {
                int Galletas_Casino_y_Tentación = (int) Math.ceil((double) cant_productos / 1);
                System.out.println("Puede ocupar " + Galletas_Casino_y_Tentación + "Galletas Casino y Tentación.");
            }
            double  totalgalletas=2.50,totaltentacion;
            int cantidadcasino;
            System.out.println("¿cuantos productos desea llevar?");
            cantidadcasino=pato.nextInt();
            totaltentacion=totalgalletas * cantidadcasino;
            System.out.println("el total a pagar es:" + totalgalletas);
            break;

            case 7:
            if (cant_productos <= 1) {
                System.out.println("Puede ocupar " + cant_productos + "Margarina Manty.");
            } else {
                int Margarina_Manty = (int) Math.ceil((double) cant_productos / 1);
                System.out.println("Puede ocupar " + Margarina_Manty + "Margarina Manty.");
            }
            double  totalmarga=5.50,totalmargarina;
            int cantidadmanty;
            System.out.println("¿cuantos productos desea llevar?");
            cantidadmanty=pato.nextInt();
            totalmargarina=totalmarga * cantidadmanty;
            System.out.println("el total a pagar es:" + totalmarga);
            break;

            case 8:
            if (cant_productos <= 1) {
                System.out.println("Puede ocupar " + cant_productos + "Mayonesa Alacena.");
            } else {
                int Mayonesa_Alacena = (int) Math.ceil((double) cant_productos / 1);
                System.out.println("Puede ocupar " + Mayonesa_Alacena + "Mayonesa Alacena.");
            }
            double  totalmayons=18.40,totalmayonesa;
            int cantidadalacena;
            System.out.println("¿cuantos productos desea llevar?");
            cantidadalacena=pato.nextInt();
            totalmayonesa=totalmayons * cantidadalacena;
            System.out.println("el total a pagar es:" + totalmayons);
            break;

            case 9:
            if (cant_productos <= 1) {
                System.out.println("Puede ocupar " + cant_productos + "Crema de ají Tarí.");
            } else {
                int Crema_de_ají_Tarí = (int) Math.ceil((double) cant_productos / 1);
                System.out.println("Puede ocupar " + Crema_de_ají_Tarí + "Crema de ají Tarí.");
            }
            double  totalcrema=13.00,totaltari;
            int cantidadaji;
            System.out.println("¿cuantos productos desea llevar?");
            cantidadaji=pato.nextInt();
            totaltari=totalcrema * cantidadaji;
            System.out.println("el total a pagar es:" + totalcrema);
            break;

            case 10:
            if (cant_productos <= 1) {
                System.out.println("Puede ocupar " + cant_productos + "Refrescos Negrita.");
            } else {
                int Refrescos_Negrita = (int) Math.ceil((double) cant_productos / 1);
                System.out.println("Puede ocupar " + Refrescos_Negrita + "Refrescos Negrita.");
            }
            double  totalrefres=5.00,totalnegrita;
            int cantidadrefrescos;
            System.out.println("¿cuantos productos desea llevar?");
            cantidadrefrescos=pato.nextInt();
            totalnegrita=totalrefres * cantidadrefrescos;
            System.out.println("el total a pagar es:" + totalrefres);
            break;

            case 11:
            if (cant_productos <= 1) {
                System.out.println("Puede ocupar " + cant_productos + "masamora negrita.");
            } else {
                int Masamora_Negrita = (int) Math.ceil((double) cant_productos / 1);
                System.out.println("Puede ocupar " + Masamora_Negrita + "masamora negrita .");
            }
            double  totalmasmr=3.40,totalnegrit;
            int cantidadrefresco;
            System.out.println("¿cuantos productos desea llevar?");
            cantidadrefresco=pato.nextInt();
            totalnegrit=totalmasmr * cantidadrefresco;
            System.out.println("el total a pagar es:" + totalmasmr);
            break;
            case 12:
            if (cant_productos <= 1) {
                System.out.println("Puede ocupar " + cant_productos + "arina blanca flor");
            } else {
                int Harina_Blanca_Flor = (int) Math.ceil((double) cant_productos / 1);
                System.out.println("Puede ocupar " + Harina_Blanca_Flor + "harina blanca flor.");
            }
            double  totalharina=8.50,totalflor;
            int cantidadblanca;
            System.out.println("¿cuantos productos desea llevar?");
            cantidadblanca=pato.nextInt();
            totalflor=totalharina * cantidadblanca;
            System.out.println("el total a pagar es:" + totalharina);
            break;

            case 13:
            if (cant_productos <= 1) {
                System.out.println("Puede ocupar " + cant_productos + "salsa roja don bitolio.");
            } else {
                int Salsa_Roja_Don_Vitolio = (int) Math.ceil((double) cant_productos / 1);
                System.out.println("Puede ocupar " + Salsa_Roja_Don_Vitolio + "salsa soja don bitolio.");
            }
            double  totalsalsa=4.20,totalbitilio;
            int cantidadsoja;
            System.out.println("¿cuantos productos desea llevar?");
            cantidadsoja=pato.nextInt();
            totalbitilio=totalsalsa * cantidadsoja;
            System.out.println("el total a pagar es:" + totalsalsa);
            break;

            case 14:
            if (cant_productos <= 1) {
                System.out.println("Puede ocupar " + cant_productos + "paneton satón.");
            } else {
                int Panetom_Sayón = (int) Math.ceil((double) cant_productos / 1);
                System.out.println("Puede ocupar " + Panetom_Sayón + "paneton sayón");
            }
            double  totalpanetn=10.59,totalsayon;
            int cantidadpaneton;
            System.out.println("¿cuantos productos desea llevar?");
            cantidadpaneton=pato.nextInt();
            totalsayon=totalpanetn * cantidadpaneton;
            System.out.println("el total a pagar es:" + totalpanetn);
            break;

            case 15:
            if (cant_productos <= 1) {
                System.out.println("Puede ocupar " + cant_productos + "cereales angel.");
            } else {
                int Cereales_angel = (int) Math.ceil((double) cant_productos / 1);
                System.out.println("Puede ocupar " + Cereales_angel + "cereales angel.");
            }
            double  totalcereal=15.40,totalangel;
            int cantidadcereales;
            System.out.println("¿cuantos productos desea llevar?");
            cantidadcereales=pato.nextInt();
            totalangel=totalcereal * cantidadcereales;
            System.out.println("el total a pagar es:" + totalcereal);
            break;

        }

        return null;
    }
    public String fTipoPago() {
        Scanner robo = new Scanner(System.in);

        System.out.println("¿Cual sera el metodo de pago?");
        System.out.println(" 1 tarjeta de cretido o debito / 2 efectivo");
        int opc_pago = robo.nextInt();
        robo.nextLine();

        switch (opc_pago) {
            case 1:
            System.out.println("Ingrese su nombre");
            String nombreTarjeta = robo.nextLine();

            System.out.println("Ingrese su apellido");
            String apellidoTarjeta = robo.nextLine();

            System.out.println("Ingrese su numero de tarjeta");
            String numeroTarjeta = robo.nextLine();

            System.out.println("Ingrese la fecha de vencimiento (MM/AA): ");
            String fechaVencimiento = robo.nextLine();

            System.out.println("Ingrese su codigo de seguridad (CVV): ");
            String codigoCVV = robo.nextLine();


            System.out.println("Pago con tarjeta de crédito/débito realizado exitosamente.");
            break;

            case 2:
            System.out.println("Ingrese su nombre");
            String nombreEfectivo = robo.nextLine();

            System.out.println("Ingrese su apellido");
            String apellidoEfectivo = robo.nextLine();

            System.out.println("Ingrese su numero de DNI");
            String dniEfectivo = robo.nextLine();


            System.out.println("Pago en efectivo realizado exitosamente.");
            break;

            default:
            System.out.println("Opcion de pago no valida. Intente nuevamente.");
            return fTipoPago();
        }

        return null;
    }


    public static void main (String[]Args){
        System.out.println("----BIENVENIDO A ALICORP----");

        trabajo_alicorp pepsi = new trabajo_alicorp();
        pepsi.fEDAD();

    }

}