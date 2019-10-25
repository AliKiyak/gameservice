package be.thomasmore.team14.game.repository;

import be.thomasmore.team14.game.entity.Game;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface GameRepository extends MongoRepository<Game, String> {

}
