package pl.itger.polishAPI.codecs;

import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import pl.itger.polishAPI.io.swagger.model.AccountPsuRelation;

public class TypeOfProxyEnumCodec implements Codec<AccountPsuRelation.TypeOfProxyEnum> {
    @Override
    public AccountPsuRelation.TypeOfProxyEnum decode(BsonReader reader, DecoderContext decoderContext) {
        return AccountPsuRelation.TypeOfProxyEnum.fromValue(reader.readString());
    }

    @Override
    public void encode(BsonWriter writer, AccountPsuRelation.TypeOfProxyEnum value, EncoderContext encoderContext) {
        writer.writeString(value.toString());
    }

    @Override
    public Class<AccountPsuRelation.TypeOfProxyEnum> getEncoderClass() {
        return AccountPsuRelation.TypeOfProxyEnum.class;
    }
}
