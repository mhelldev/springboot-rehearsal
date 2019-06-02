import React from 'react';
import ChordDisplay from './ChordDisplay';

function SongDisplay(props) {
    const { song } = props;
    const { onEdit } = props;
    return (

        <div className="Song">
            <div className="SongName">
                {song.name}
            </div>
            <div className="Description">
                {song.description}
            </div>

            <ChordDisplay song={song} />
            <button type="button" onClick={onEdit}>edit</button>           
        </div>
    );
}

export default SongDisplay;