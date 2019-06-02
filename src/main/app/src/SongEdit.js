import React, { Component } from 'react';
import ChordEdit from './ChordEdit';

class SongEdit extends Component {

    constructor(props) {
        super(props);
        this.state = {
            name: props.song.name,
            description: props.song.description,
            id: props.song.id
        };
        this.handleNameChange = this.handleNameChange.bind(this);
        this.handleDescriptionChange = this.handleDescriptionChange.bind(this);
    }

    handleNameChange(event) {
        this.setState({ name: event.target.value });
    }

    handleDescriptionChange(event) {
        this.setState({ description: event.target.value });
    }

    render() {
        const { song } = this.props;
        const {onEditHide} = this.props;
        const {onUpdate} = this.props;
        return (
            <div>
                <div className="Formular SongListHeader">
                    <div className="Label">Name</div>
                    <input type="text" value={this.state.name} onChange={this.handleNameChange} />
                    <div className="Label">Description</div>
                    <input type="text" value={this.state.description} onChange={this.handleDescriptionChange} />
                    <ChordEdit song={song} />
                    <button type="button" onClick={() => onUpdate(
                        {
                            name: this.state.name, 
                            description: this.state.description,
                            id: this.state.id,
                            parts: song.parts
                        })}>
                        submit</button>
                    <button type="button" onClick={onEditHide}>cancel</button>
                </div>
                
            </div>
        );
    }
}

export default SongEdit;