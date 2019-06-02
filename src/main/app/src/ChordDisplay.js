import React from 'react';

function ChordDisplay(props) {
    const {song} = props;
    return(
        <div className="Chords">
            {song.parts.split('\n').map(part =>
                <div className="Part"
                    key={part.id}>
                    {part.split(' ').map(c =>
                        <div key={c} className="Chord">
                            {c}
                        </div>
                    )}                    
                </div>
            )}
        </div>
    );
}

export default ChordDisplay;