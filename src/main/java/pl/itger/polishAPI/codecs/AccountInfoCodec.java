package pl.itger.polishAPI.codecs;

import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import pl.itger.polishAPI.io.swagger.model.AccountInfo;
import pl.itger.polishAPI.io.swagger.model.AccountPsuRelation;

public class AccountInfoCodec implements Codec<AccountInfo> {
    @Override
    public AccountInfo decode(BsonReader reader, DecoderContext decoderContext) {
        return null;
    }

    @Override
    public void encode(BsonWriter writer, AccountInfo value, EncoderContext encoderContext) {

    }

    @Override
    public Class<AccountInfo> getEncoderClass() {
        return null;
    }
}
