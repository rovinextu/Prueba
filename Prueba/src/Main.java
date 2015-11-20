import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
// TODO Auto-generated method stub

String rx_name="";	
String rx_tel="";
String rx_correo="";
String rx_consulta_persona="";
int encontrado = 0;
Scanner sc = new Scanner(System.in);
Persona person = new Persona();
ArrayList <Persona> PersonArrayList = new ArrayList <Persona> ();

System.out.println("****REGISTRAR PERSONA****");

System.out.println("Ingrese nombre de persona: \n");
rx_name = sc.nextLine();
person.setNombre(rx_name);
rx_name="";

System.out.println("Ingrese telefono: \n");
rx_tel = sc.nextLine();
person.setTelefono(rx_tel);
rx_tel="";	


System.out.println("Ingrese correo electronico: \n");
rx_correo = sc.nextLine();
person.setCorreo(rx_correo);
rx_correo="";	

PersonArrayList.add(person);


Iterator<Persona> it = PersonArrayList.iterator();
int aux = 0;
while (it.hasNext()) {
person = it.next();
System.out.print("\nNombre: "
+ person.getNombre() + "\nTelefono: "
+ person.getTelefono() + "\nCorreo Electronico: "
+ person.getCorreo() + "\n" + "Indice: "
+ aux + "\n");
aux++;

}


System.out.println("****CONSULTAR****");


System.out.println("Ingrese el nombre a consultar: \n");
rx_consulta_persona = sc.nextLine();
Iterator<Persona> it2 = PersonArrayList.iterator();

for(int i=0; i<=PersonArrayList.size(); i++)
{

while (it2.hasNext());

if(rx_consulta_persona.equals(PersonArrayList.get(i).getNombre()))
{
System.out.println("Persona existente en la posicion "+i);
encontrado=1;
}




}


if(encontrado == 0)
{
System.out.println("Persona no encontrada ");
}
else
{
encontrado=0;
}


sc.close();

}

}