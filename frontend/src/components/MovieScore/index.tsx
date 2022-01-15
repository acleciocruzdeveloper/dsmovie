import './styles.css';
import MovieStar from 'components/MovieStar';

function MovieScore() {

    const score = 3.5;
    const count = 3.5;

    return (

        <div className="dsmovie-score-container">
            <p className="dsmovie-score-value">{score > 0 ? score.toFixed(1) : '-'}</p>
            <MovieStar />
            <p className="dsmovie-score-count">{count} avaliações</p>
        </div>
    )

}

export default MovieScore;