import React, { Component } from 'react';
import SongDisplay from './SongDisplay';
import SongEdit from "./SongEdit";

class Song extends Component {

	constructor(props) {
		super(props);
		this.state = {
			isEdit: false
		}
		this.edit = this.edit.bind(this);
		this.editHide = this.editHide.bind(this);
		this.update = this.update.bind(this);
	}

	update(song) {
		this.editHide();
		this.props.onSubmitHandler(song);
	}

	edit() {
		const { song } = this.props;
		this.setState({
			isEdit: true
		});
	}

	editHide() {
		this.setState({
			isEdit: false
		});
	}

	render() {
		const { song } = this.props;
		const { isEdit } = this.state;
		return (
			<div>
				{isEdit ?
					<SongEdit song={song} 
						onEditHide={this.editHide} 
						onUpdate={this.update}/>
					:
					<SongDisplay song={song} onEdit={this.edit} />
				}
			</div>
		);
	}

}
export default Song;