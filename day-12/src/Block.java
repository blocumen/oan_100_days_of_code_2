import java.util.Date;

public class Block {
    public String hash;
    public String previous_hash;
    public String data;
    private final Long timestamp;

    public Block(String data, String previous_hash) {
        this.data = data;
        this.previous_hash = previous_hash;
        this.timestamp = new Date().getTime();
        this.hash = calculateHash();
    }


    public String calculateHash() {
        String calculate_hash = StringUtil.applySha256(
                previous_hash + timestamp + data
        );
        return calculate_hash;
    }
}
