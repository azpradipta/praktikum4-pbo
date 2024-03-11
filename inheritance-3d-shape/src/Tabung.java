public class Tabung extends BangunRuang {
    private float jariTabung;
    private float tinggiTabung;

    public Tabung(float jariTabung, float tinggiTabung) {
        this.jariTabung = jariTabung;
        this.tinggiTabung = tinggiTabung;
    }

    @Override
    public float hitungLuasPermukaan() {
        return 2 * (float) Math.PI * jariTabung * (jariTabung + tinggiTabung);
    }

    @Override
    public float hitungVolume() {
        return (float) (Math.PI * Math.pow(jariTabung, 2)* tinggiTabung);
    }
}