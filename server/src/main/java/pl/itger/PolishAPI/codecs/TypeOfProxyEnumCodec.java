package pl.itger.PolishAPI.codecs;

import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import pl.itger.PolishAPI.io.swagger.model.AccountPsuRelation;

public class TypeOfProxyEnumCodec implements Codec<AccountPsuRelation.TypeOfProxyEnum> {
    @Override
    public AccountPsuRelation.TypeOfProxyEnum decode(BsonReader reader, DecoderContext decoderContext) {
        System.out.println("XXX decode");
        return AccountPsuRelation.TypeOfProxyEnum.fromValue(reader.readString());
    }

    @Override
    public void encode(BsonWriter writer, AccountPsuRelation.TypeOfProxyEnum value, EncoderContext encoderContext) {
        System.out.println("XXX encode");
        writer.writeString(value.toString());
    }

    @Override
    public Class<AccountPsuRelation.TypeOfProxyEnum> getEncoderClass() {
        System.out.println("XXX getEncoderClass");
        return AccountPsuRelation.TypeOfProxyEnum.class;
    }
}
