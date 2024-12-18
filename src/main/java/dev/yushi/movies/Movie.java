package dev.yushi.movies;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id
    @JsonSerialize(using = ObjectIdSerializer.class)
    private ObjectId id;
    @Field("imdbId")
    private String imdbId;
    @Field("releaseDate")
    private String releaseDate;
    @Field("trailerLink")
    private String trailerLink;
    @Field("title")
    private String title;
    @Field("poster")
    private String poster;
    @Field("genres")
    private List<String> genres;
    @Field("backdrops")
    private List<String> backdrops;

//    @DocumentReference
//    private List<Review> reviewIds;

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", imdbId='" + imdbId + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", trailerLink='" + trailerLink + '\'' +
                ", title='" + title + '\'' +
                ", poster='" + poster + '\'' +
                ", genre=" + genres +
                ", backdrops=" + backdrops +
//                ", reviewIds=" + reviewIds +
                '}';
    }

}


