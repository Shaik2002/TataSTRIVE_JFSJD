import { useState } from 'react';
import P5A from './P5A';
import P5B from './P5B';

const P5TernaryOperator = () => {
    const [data, setData] = useState(true)
    return (
        <div>
            {data ? <P5A /> : <P5B />}
        </div>
        )
    }
export default P5TernaryOperator;