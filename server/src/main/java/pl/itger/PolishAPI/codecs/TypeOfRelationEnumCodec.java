package pl.itger.PolishAPI.codecs;

import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import pl.itger.PolishAPI.io.swagger.model.AccountPsuRelation;

public class TypeOfRelationEnumCodec implements Codec<AccountPsuRelation.TypeOfRelationEnum> {
    @Override
    public AccountPsuRelation.TypeOfRelationEnum decode(BsonReader reader, DecoderContext decoderContext) {
        System.out.println("XXX decode");
        return AccountPsuRelation.TypeOfRelationEnum.fromValue(reader.readString());
    }

    @Override
    public void encode(BsonWriter writer, AccountPsuRelation.TypeOfRelationEnum value, EncoderContext encoderContext) {
        System.out.println("XXX encode");
        writer.writeString(value.toString());
    }

    @Override
    public Class<AccountPsuRelation.TypeOfRelationEnum> getEncoderClass() {
        System.out.println("XXX getEncoderClass");
        return AccountPsuRelation.TypeOfRelationEnum.class;
    }
}
