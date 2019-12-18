package pl.itger.polishAPI.codecs;

import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import pl.itger.polishAPI.io.swagger.model.AccountPsuRelation;

public class TypeOfRelationEnumCodec implements Codec<AccountPsuRelation.TypeOfRelationEnum> {
    @Override
    public AccountPsuRelation.TypeOfRelationEnum decode(BsonReader reader, DecoderContext decoderContext) {
        return AccountPsuRelation.TypeOfRelationEnum.fromValue(reader.readString());
    }

    @Override
    public void encode(BsonWriter writer, AccountPsuRelation.TypeOfRelationEnum value, EncoderContext encoderContext) {
        writer.writeString(value.toString());
    }

    @Override
    public Class<AccountPsuRelation.TypeOfRelationEnum> getEncoderClass() {
        return AccountPsuRelation.TypeOfRelationEnum.class;
    }
}
