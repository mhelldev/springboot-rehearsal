import React, { Component } from 'react';
import './Song.css';
import Song from './Song';
import NewSong from './NewSong';
const API = '/songs';

class SongController extends Component {
	constructor(props) {
		super(props);
		this.state = {
			data: [],
			isNewSong: false
		};
		this.showNewSong = this.showNewSong.bind(this);
		this.hideNewSong = this.hideNewSong.bind(this);
		this.submitSong = this.submitSong.bind(this);
		this.refreshSongs = this.refreshSongs.bind(this)
	}

	componentDidMount() {
		this.refreshSongs();
	}

	refreshSongs() {
		fetch(API)
			.then(response => response.json())
			.then(data => this.setState({ data }));
		this.setState({ isNewSong: false });
	}

	showNewSong() {
		this.setState({ isNewSong: true });
	}

	hideNewSong() {
		this.setState({ isNewSong: false });
	}

	submitSong(song) {
		console.log("submit new song:", song);
		fetch(API, {
			method: 'POST',
			headers: { 'Content-Type': 'application/json' },
			body: JSON.stringify(song)
		}).then(() => this.refreshSongs());
	}

	render() {

		const { data } = this.state;
		const { isNewSong } = this.state;

		return (
			<div>
				<div className="SongListHeader">
					{isNewSong ? <NewSong onCancelHandler={this.hideNewSong}
						onSubmitHandler={this.submitSong} />
						: <button type="button" onClick={this.showNewSong}>
							add Song
						</button>
					}
				</div>
				<div className="SongList">
					{data.map(song =>
						<Song key={song.id}
							song={song} 
							onSubmitHandler={this.submitSong}/>
					)}
				</div>
			</div>
		);
	}
}

export default SongController;
