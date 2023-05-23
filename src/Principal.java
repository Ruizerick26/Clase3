import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Genero Rock= new Genero( "Rock","120bpn",1950,"Eu","Chuck Berry","Fesival de california" );
        Genero Salsa=new Genero("Salsa","100bpn",1970,"Panama","Ruben Blades","Festival Internacional de salsa");
        Genero Vallenato = new Genero("Vallenatos","80bpn", 2023,"Colombia","Binomio de oro","Tributo al vallenato");
        System.out.println(Salsa.getAnio());
        System.out.println(Rock.getAnio());
        System.out.println(Vallenato.getAnio());
        System.out.println(Salsa.getAnio()+Rock.getAnio()+Vallenato.getAnio());

        Rock.imprimir_Datos();
        System.out.printf("El genero %s posee un ritmo de %s y fue creado en el año %s y en el pais %s y uno de sus primeros artistas fue %s y toco en el %s");

        Scanner valor = new Scanner(System.in);

        System.out.println("Ingrese el año al que desea cambiar del genero Rock");
        int aniotemp=valor.nextInt();
        Rock.setAnio(aniotemp);
        System.out.println("Ingrese el año al que desea cambiar del genero Salsa");
        aniotemp=valor.nextInt();
        Salsa.setAnio(aniotemp);
        System.out.println("Ingrese el año al que desea cambiar del genero Vallenato");
        aniotemp=valor.nextInt();
        Vallenato.setAnio(aniotemp);

        System.out.println("El nuevo año del genero rock es:"+Rock.getAnio());
        System.out.println("El nuevo año del genero salsa es:"+Salsa.getAnio());
        System.out.println("El nuevo año del genero vallenatoes:"+Vallenato.getAnio());
        //hola a todos de nuevo


    }
}
