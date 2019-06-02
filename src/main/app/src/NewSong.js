import React, { Component } from 'react';


class NewSong extends Component {

	constructor(props) {
		super(props);
		this.state = {
			name: "",
			description: ""
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
		return (
			<div className="Formular">
				<div className="Label">Name</div>
				<input type="text" value={this.state.name} onChange={this.handleNameChange} />
				<div className="Label">Description</div>
				<input type="text" value={this.state.description} onChange={this.handleDescriptionChange} />
				<button type="button" onClick={() => this.props.onSubmitHandler(
					{
						name: this.state.name, description: this.state.description, parts: ""
					})}>
					submit</button>
				<button type="button" onClick={this.props.onCancelHandler}>cancel</button>
			</div>);
	}
}

export default NewSong;
