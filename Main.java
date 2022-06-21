class Main {
  public static void main(String[] args) {

    int[] tablica = {2,4,6,8,10,12,14,16,18,20};
    int suma=0;

    for(int i=0;i<9;i++){
      if(i%2==0){
        suma=suma+tablica[i];
      }
    }
    System.out.println("Suma: "+suma);
  }
}