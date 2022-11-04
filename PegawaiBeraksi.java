public class PegawaiBeraksi {
    public static void main(String[] args) {
      // Membuat Object
      Manager Nana = new Manager();
      Programmer Beno = new Programmer();
  
      /* Memberi attribute dan memberi nilai */
      Nana.setNama("Nanda Ratna Sari");
      Nana.setGajiPokok(8000000);
      Nana.setTunjangan(1000000);
  
      Beno.setNama("Beno");
      Beno.setGajiPokok(4800000);
      Beno.setBonus(600000);
  
      /* Mengakses Method */
      Nana.cetakInfo();
      System.out.println();
      Beno.cetakInfo();
    }
  }