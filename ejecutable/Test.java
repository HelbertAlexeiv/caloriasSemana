import javax.swing.JOptionPane;

public class Test{
  public static void main(String[] args){
    int[] calorias;
    int caloriasTotales = 0;
    int componente1 = 0;
    int componente2 = 0;
    int count = 0;
    calorias =  new int[7];
    for(int i = 0; i<calorias.length; i++){
      calorias[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de calorias: "));
      caloriasTotales += calorias[i];
    }
    
    //Orden descendente
    while(count <= calorias.length){
      count ++;
      for(int i = 0; i<calorias.length; i++){
	if((i+1)<calorias.length && calorias[i]<calorias[i+1]){
	    componente1 = calorias[i];
	    componente2 = calorias[i+1];
	    calorias[i]= componente2;
	    calorias[i+1]= componente1;
	}
      }
    }

    //Salida
    System.out.println("Array formado: " + calorias);
    for(int i =0; i<calorias.length; i++){
      System.out.print(calorias[i]);
      System.out.println();
    }

  }
}
