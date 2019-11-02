package be.thomasmore.team14.game.repository;

import be.thomasmore.team14.game.entity.Game;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GameRepository extends MongoRepository<Game, String> {
    List<Game> findGameById(@Param("id") String id);

}
