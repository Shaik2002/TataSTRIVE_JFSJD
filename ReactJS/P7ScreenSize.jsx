import {useState, useEffect} from 'react';
const P7ScreenSize = () => {
    const [screenSize, setScreenSize] = useState ({
        width:window.innerWidth,
        height:window.innerHeight
        });
    const updateScreenSize = () => {
        setScreenSize({
            width:window.innerWidth,
            height:window.innerHeight
            })
        }
    useEffect (() => {
        window.addEventListener("resize",updateScreenSize)
        } , [])
    return(
        <div>
            <p style={{ color: "midnightBlue", fontSize: "20px", fontWeight: "bold" }}>
                Width : {screenSize.width}px
            </p>
            <p style={{ color: "midnightBlue", fontSize: "20px", fontWeight: "bold" }}>
                Height : {screenSize.height}px
            </p>
        </div>
        )
    }

export default P7ScreenSize;