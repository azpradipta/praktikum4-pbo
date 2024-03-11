public class Kubus extends BangunRuang {
    private float sisi;

    public Kubus(float sisi) {
        this.sisi = sisi;
    }

    @Override
    public float hitungLuasPermukaan() {
        return 6 * sisi * sisi;
    }

    @Override
    public float hitungVolume() {
        return sisi * sisi * sisi;
    }
}