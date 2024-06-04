
package tugas4rijal;

public class Kendaraan {
    private String namaKendaraan;
    private int thnProduksi;
    
    public Kendaraan (String nama, int thn){
    this.namaKendaraan = nama;
    this.thnProduksi = thn;
    }
    public String getKendaraan(){
        return namaKendaraan;
    }
    public void setNama(String nama){
        this.namaKendaraan = nama;
    }
    public int getTahunProduksi(){
        return thnProduksi;
        
    }
    public void setTahunProduksi(int thn){
        this.thnProduksi = thn;
        
    }
   public void info(){
       System.out.println("Kendaraan "+ namaKendaraan + ", tahun produksi : "+ thnProduksi);
   }
    
}
