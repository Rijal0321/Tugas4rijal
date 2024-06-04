
package tugas4rijal;

class Mobil extends Kendaraan{
    private String model;

    public Mobil (String nama, int thn, String model){
        super (nama, thn);
        this.model = model;
        
    }
    @Override
    public void info() {
        System.out.println("Mobil "+ getKendaraan() +" ,model " + model + " tahun produksi "+ getTahunProduksi());
    }
    
}
