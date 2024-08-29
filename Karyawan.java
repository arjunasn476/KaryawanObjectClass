public class Karyawan{
    int id;
    String nama;
    double ipk;
    String unit;
    String alamat;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getIpk() {
        return this.ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    //Constructor
    //nama harus sama dgn Class
    public Karyawan() {
        id = 0;
        nama = "kosong";
        ipk = 0.0;
        unit = "kosong";
        alamat = "kosong";

    }

    //Constructor Parameter
    public Karyawan (String nama, int id, double ipk) {
        //variabel = parameter
        this.nama = nama;
        this.id = id;
        this.ipk = ipk;
        this.unit = unit;
        this.alamat = alamat;
    }

    //method print
    public void print() {
        System.out.println("Id : " + id);
        System.out.println("Nama : " + nama);
        System.out.println("Ipk : " + ipk);
        System.out.println("Unit : " + unit);
        System.out.println("Alamat : " + alamat);
    }
}