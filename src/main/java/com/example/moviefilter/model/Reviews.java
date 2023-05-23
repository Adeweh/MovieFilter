package com.example.moviefilter.model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Document(collection = "reviews")
public class Reviews {
    @Id
    private ObjectId id;
    private String body;

    public Reviews(String body) {
        this.body=body;
    }
}
