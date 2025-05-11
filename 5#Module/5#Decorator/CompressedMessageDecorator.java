package fifthModuleFifthTask;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;
import java.util.Base64;

public class CompressedMessageDecorator extends MessageDecorator{
    public CompressedMessageDecorator(Message decoratedMessage) {
        super(decoratedMessage);
    }

    @Override
    public String getContent() {
        String original = super.getContent();
        return compress(original);
    }

    private String compress(String data) {
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            DeflaterOutputStream deflater = new DeflaterOutputStream(out);
            deflater.write(data.getBytes("UTF-8"));
            deflater.finish();
            return Base64.getEncoder().encodeToString(out.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException("Compression error", e);
        }
    }
}
