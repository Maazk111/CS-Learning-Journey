import profilePic from './assets/pic.webp'
function Card(){

    return(
        <div className="card">
            <img className="card-image" src={profilePic} alt="Profile Picture" />
            <h2 className='card-title'>Bro Code</h2>
            <p className='card-text' >I make Youtube videos and play video games</p>
        </div>
    );

}

export default Card