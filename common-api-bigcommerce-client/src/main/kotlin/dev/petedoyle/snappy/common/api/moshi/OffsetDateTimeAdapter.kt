package dev.petedoyle.snappy.common.api.moshi

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter

object OffsetDateTimeAdapter : JsonAdapter<OffsetDateTime>() {
    override fun fromJson(reader: JsonReader): OffsetDateTime? {
        if (reader.peek() == JsonReader.Token.NULL) {
            return reader.nextNull()
        }
        return OffsetDateTime.parse(reader.nextString(), DateTimeFormatter.ISO_OFFSET_DATE_TIME)
    }

    override fun toJson(writer: JsonWriter, value: OffsetDateTime?) {
        if (value == null) {
            writer.nullValue()
        } else {
            val string: String = value.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
            writer.value(string)
        }
    }
}