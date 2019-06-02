import React, { Component } from 'react';

class ChordEdit extends Component {

    constructor(props) {
        super(props);
        this.state = { song: props.song };
        this.setChords = this.setChords.bind(this);
    }

    setChords(event) {
        const { song } = this.state;
        song.parts = event.target.value;
        this.setState({ song });
    }

    render() {
        const { song } = this.state;
        return (
            <div className="Chords">
                <textarea value={song.parts}
                    onChange={this.setChords} />
            </div>
        );
    }
}

export default ChordEdit;