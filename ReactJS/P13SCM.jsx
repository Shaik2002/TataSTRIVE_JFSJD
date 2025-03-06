import P11NestedMap from './P11NestedMap';
import {useState} from 'react';

const P13SCM = () => {
    const [shortCircuit,newShortCircuit] = useState(true)
    return(
        <div>
            {shortCircuit && <P11NestedMap />}
            </div>
        )
    }
export default P13SCM;