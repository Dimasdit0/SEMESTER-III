package responsi;

class Anggota {
    private String name;
    private String memberId;

    public Anggota(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }
}
