package dev.petedoyle.commerce.common.api.moshi

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import java.math.BigDecimal

object BigDecimalAdapter : JsonAdapter<BigDecimal>() {
    override fun fromJson(reader: JsonReader): BigDecimal? {
        if (reader.peek() == JsonReader.Token.NULL) {
            return reader.nextNull()
        }
        return BigDecimal(reader.nextString())
    }

    override fun toJson(writer: JsonWriter, value: BigDecimal?) {
        if (value == null) {
            writer.nullValue()
        } else {
            val string: String = value.toPlainString()
            writer.value(string)
        }
    }
}