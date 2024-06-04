
package tugas4rijal;

class Motor extends Kendaraan{
    private String tipe;

    public Motor (String nama, int thn, String tipe){
        super (nama, thn);
        this.tipe = tipe;
        
    }
    @Override
    public void info() {
        System.out.println("Motor "+ getKendaraan() +" ,tipe "+ tipe + " tahun produksi "+ getTahunProduksi() );
    }
    
}

