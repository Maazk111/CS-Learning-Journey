function ProfilePicture(){

    const imaeUrl = '/.src/assets/pic.webp'

    const handleClick = (e) => e.target.style.display = "none" ;

    return(
        <img  onClick={(e) => handleClick(e)} src={imaeUrl} ></img>
    );
}


export default ProfilePicture