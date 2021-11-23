package dev.petedoyle.snappy.common.api.moshi

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import java.time.LocalDate
import java.time.format.DateTimeFormatter

object LocalDateAdapter : JsonAdapter<LocalDate>() {
    override fun fromJson(reader: JsonReader): LocalDate? {
        if (reader.peek() == JsonReader.Token.NULL) {
            return reader.nextNull()
        }
        return LocalDate.parse(reader.nextString(), DateTimeFormatter.ISO_LOCAL_DATE)
    }

    override fun toJson(writer: JsonWriter, value: LocalDate?) {
        if (value == null) {
            writer.nullValue()
        } else {
            val string: String = value.format(DateTimeFormatter.ISO_LOCAL_DATE)
            writer.value(string)
        }
    }
}