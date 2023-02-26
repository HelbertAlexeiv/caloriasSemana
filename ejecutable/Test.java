import javax.swing.JOptionPane;

public class Test{
  public static void main(String[] args){
    int[] calorias;
    int caloriasTotales = 0;
    int componente1 = 0;
    int componente2 = 0;
    calorias =  new int[4];
    for(int i = 0; i<calorias.length; i++){
      calorias[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de calorias: "));
      caloriasTotales += calorias[i];
    }
    //Orden descendente
    System.out.println("Llegando al for descendente");
    for(int i = 0; i<calorias.length; i++){
      System.out.println("Iteracion " + i);
      if((i+1)<calorias.length && calorias[i]>calorias[i+1]){
	calorias[i] = calorias[i];
	
      }
      else{
	if(i+1 < calorias.length){
	  componente1 = calorias[i];
	  componente2 = calorias[i+1];
	  calorias[i]= componente2;
	  calorias[i+1]= componente1;
	}
	else{
	  componente1=calorias[i];
	}

      }
    }
    //Salida
    for(int i =0; i<calorias.length; i++){
      System.out.print(calorias[i]);
      System.out.println();
    }

  }
}
