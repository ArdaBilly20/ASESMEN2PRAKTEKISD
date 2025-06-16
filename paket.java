import java.util.ArrayList;
import java.util.List;

public class paket {
    private String idString;
    private String nama;
    private String alamat;
    private String tanggal;
    private List<String> tipelayanan;

    public paket(String nama, String alamat, String tanggal) {
        this.nama = nama;
        this.alamat = alamat;
        this.tanggal = tanggal;
        this.idString = "Paket-" + nama + "-" + alamat + "-" + tanggal;
        this.tipelayanan = new ArrayList<>();
    }
    public String getIdString() {
        return idString;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTanggal() {
        return tanggal;
    }

    public List<String> getTipeLayanan() {
        return tipelayanan;
    }

    }

    




