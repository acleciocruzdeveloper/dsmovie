/* eslint-disable react/react-in-jsx-scope */
import { ReactComponent as GithubIcon } from 'assets/img/github.svg';
import './style.css';

function NavBar() {
    return (
    <header>
        <nav className='container'>
            <div className='dsmovie-nav-content'>
                <h1>NetHero</h1>
                <a href="https://github.com/acleciocruzdeveloper/dsmovie">
                    <div className='dsmovie-contact-container'>
                        <GithubIcon />
                        <p className='dsmovie-contact-link'>/acleciocruzdeveloper</p>
                    </div>
                </a>
            </div>
        </nav>
    </header>)
}
export default NavBar;